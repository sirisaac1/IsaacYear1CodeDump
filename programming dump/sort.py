import os
import string
import shutil
import glob

path = ('C:/Users/isaac/Desktop') 
list = os.listdir(path)

for file in list:
    name, ext = os.path.splitext(file)
    
    ext = ext[1:]
    if ext == '':
        continue

    if os.path.exists(path+'/'+ext):
        shutil.move(path+'/'+file, path+'/'+ext+'/'+file)
    else:
        os.makedirs(path+'/'+ext)
        shutil.move(path+'/'+file, path+'/'+ext+'/'+file)

