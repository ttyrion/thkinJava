import os
import sys

code_file = sys.argv[1]
section = code_file.split(".")
class_name = section[0]

job = "javac %s" % code_file
print(job)
os.system(job)
job = "java %s" % class_name
print(job)
os.system(job)