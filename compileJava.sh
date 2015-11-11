#!/bin/bash


javac -implicit:none ./snips/*.java &> out.txt ; grep "error" out.txt &> final






