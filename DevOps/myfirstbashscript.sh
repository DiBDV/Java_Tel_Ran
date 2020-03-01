#!/bin/bash

date

echo "Hey DiBDV!"

pwd

ps -ef | awk {'print $2'} | sed 1d | wc -l

ls -l /etc/passwd | awk {'print $1'}


