
#Ini adalah Dokumentasi Belajar di Praxis-academy Minggu ke 2 Hari ke 2

Belajar install Postgresql :

1. Buka Terminal kemudian inputkan $ sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt/ bionic-pgdg main" > \
/etc/apt/sources.list.d/postgresql.list'

2. kemudian inputkan lagi $ wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -

3. kemudian Upgrade, Update dan Install dengan perintah $ sudo apt-get update $ sudo apt-get upgrade

4. kemudian $ sudo apt-get install postgresql-11
