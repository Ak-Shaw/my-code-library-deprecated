print ('always executed')
print(__name__)
if __name__=='__main__':
    print ('executed when invoked directly')
else:
    print ('executed when imported')