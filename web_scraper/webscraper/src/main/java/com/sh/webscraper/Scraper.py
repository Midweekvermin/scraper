from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.chrome.options import Options
from ebooklib import epub
import os


import time

from selenium.webdriver.common.by import By
def scrape(url):
    desktop = os.path.join(os.path.expanduser("~"), "Desktop")
    chrome_options = Options()
    chrome_driver_path = r"C:\Users\midwe\chromedriver\chromedriver.exe"
    service = Service(chrome_driver_path)
    driver = webdriver.Chrome(service=service)


    driver.get(url)
    book = ""


    paragraphs = driver.find_elements(By.TAG_NAME, "p")
    for i, paragraph in enumerate(paragraphs):
        book = book + paragraph.text

    book1 = epub.EpubBook()
    book1.set_title("Hidan no Aria volume 7")
    book1.set_language("en")
    chapter1 = epub.EpubHtml(title="Chapter 1", file_name="chapter1.xhtml", lang="en")
    chapter1.content = book
    book.add_item(chapter1)
    output_file = os.path.join(desktop, "Hidan_no_Aria_v7.epub")
    epub.write_epub(output_file,book1)



    driver.quit()
