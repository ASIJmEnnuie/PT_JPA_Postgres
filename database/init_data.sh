#!/bin/bash
psql -d asijmennuie -a -f schema-postgres.sql
psql -d asijmennuie -a -f data-postgres.sql
