#!/usr/bin/python
# -*- coding: utf-8 -*-

#!/usr/bin/python
# -*- coding: utf-8 -*-

# Socket Python Doc: https://docs.python.org/2.7/library/socket.html

# Importe o pacote do socket.
import socket

# Crie um objeto socket UDP.
ipv4 = socket.AF_INET
udp = socket.SOCK_DGRAM
sock = socket.socket(ipv4, udp)
print ("Socket UDP successfully created")

# Reserve a porta na qual deseja aceitar conexões.
port = 12345

# Ative a porta para o servidor
sock.bind(('127.0.0.1', port))
print ("Socket binded to %s" %(port))

# Continue recebendo conexões enquanto a aplicação servidor estiver executando.
while True:
    # Conecte e receba dados do cliente.
    data, addr = sock.recvfrom(1024)
    print ('Got connection from', addr)
    print ('Data recv: ', data)

    # Envie dados para o cliente.
    sock.sendto('OLA SERVER.'.encode(), addr)
