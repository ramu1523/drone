FROM centos:7

 ADD script.sh /bin/
 ENTRYPOINT /bin/script.sh