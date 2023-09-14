#Log current date and time, extra line of space
#Log ipv4 address, lease time and lease expiry.
#Log default gateway, subnet mask, and physical address.
#use desktop notification to say "IP LOGGED"
#write to: 'C:\Users\isaac\Desktop\NetworkLog.txt'
import os
from datetime import datetime
import subprocess
import re


def main():

    command = 'cmd /c ipconfig /all | findstr "IPv4"'
    p = subprocess.Popen(command, stdout=subprocess.PIPE)
    currentIp = p.stdout.read()
    retCode = p.wait()
    retCode = p.kill()
    
    #separates Ip from other characters on the line retrieved from cmd
    #brute force work on the string, very very ugly
    currentIp = str(currentIp)
    currentIp = (currentIp.split(':'))
    del currentIp[0]
    currentIp = str(currentIp)
    currentIp = (currentIp.split('('))
    del currentIp[1]
    currentIp = str(currentIp)
    currentIp = currentIp.replace("'", "")
    currentIp = currentIp.replace('"', '')
    currentIp = currentIp.replace('[', '')
    currentIp = currentIp.replace(']', '')
    currentIp = currentIp.replace(' ', '')
    print(currentIp)

    commandtwo = 'cmd /c ipconfig /all | findstr "Lease"'
    s = subprocess.Popen(commandtwo, stdout=subprocess.PIPE)
    lease = s.stdout.read()
    retCodetwo = s.wait()
    retCodetwo = s.kill()
    lease = str(lease)
    #lease = (lease.split(':'))
    #del lease[0]
    print(lease)
    


    #gets time and removes milliseconds
    currentTime = str(datetime.now())
    currentTime = (currentTime.split(':'))
    del currentTime[2]
    currentTime = ':'.join(currentTime)
    
    #write info
    with open('C:\\Users\\isaac\\Desktop\\NetworkLog.txt', 'a') as f: 
        f.write('Date and Time:' + '\n')
        f.write(currentTime+'\n')
        f.write('Current IPv4 Address:' + '\n')
        f.write(str(currentIp) + '\n')
        f.write('\n')
if __name__=='__main__':
    main()