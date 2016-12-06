FROM postgres:latest
MAINTAINER thibault.theologien@insa-rouen.fr
ENV POSTGRES_USER="postgres"
ENV POSTGRES_PASSWORD="evasion"
ENV POSTGRES_DB="asijmennuie"
COPY init_data.sh /tmp/
COPY *.sql /tmp/
RUN chmod +x /tmp/*.sh
RUN chmod +x /tmp/*.sql
RUN ls -l /tmp
CMD /tmp/init_data.sh
