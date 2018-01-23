import os
import sys

job = "javac %s" % sys.argv[1] + ".java"
print(job)
os.system(job)
job = "java %s" % sys.argv[1]
print(job)
os.system(job)