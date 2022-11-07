FROM luhanlacerda/cat-api-mssql:latest

USER root

COPY ./db/mssql/setup.sql setup.sql
COPY ./db/mssql/entrypoint.sh entrypoint.sh

RUN chmod +x entrypoint.sh

CMD /bin/bash ./entrypoint.sh

ENTRYPOINT [ "/bin/bash", "./entrypoint.sh" ]
CMD [ "/opt/mssql/bin/sqlservr" ]