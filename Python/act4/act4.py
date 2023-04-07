import tkinter as tk
from tkinter import ttk, messagebox
import mysql.connector
from tkinter import *
 
def GetValue(event):
    e1.delete(0, END)
    e2.delete(0, END)
    e3.delete(0, END)
    e4.delete(0, END)
    row_id = listBox.selection()[0]
    select = listBox.set(row_id)
    e1.insert(0,select['id'])
    e2.insert(0,select['empname'])
    e3.insert(0,select['mobile'])
    e4.insert(0,select['salary'])
 
 
def Add():
    studid = e1.get()
    studname = e2.get()
    coursename = e3.get()
    feee = e4.get()
 
    mysqldb=mysql.connector.connect(host="localhost",user="root",password="",database="payroll")
    mycursor=mysqldb.cursor()
 
    try:
       sql = "INSERT INTO  registration (id,empname,mobile,salary) VALUES (%s, %s, %s, %s)"
       val = (studid,studname,coursename,feee)
       mycursor.execute(sql, val)
       mysqldb.commit()
       lastid = mycursor.lastrowid
       messagebox.showinfo("information", "Employee Inserted successfully...")
       e1.delete(0, END)
       e2.delete(0, END)
       e3.delete(0, END)
       e4.delete(0, END)
       e1.focus_set()
    except Exception as e:
       print(e)
       mysqldb.rollback()
       mysqldb.close()
 
 
def update():
    studid = e1.get()
    studname = e2.get()
    coursename = e3.get()
    feee = e4.get()
    mysqldb=mysql.connector.connect(host="localhost",user="root",password="",database="payroll")
    mycursor=mysqldb.cursor()
 
    try:
       sql = "Update  registration set empname= %s,mobile= %s,salary= %s where id= %s"
       val = (studname,coursename,feee,studid)
       mycursor.execute(sql, val)
       mysqldb.commit()
       lastid = mycursor.lastrowid
       messagebox.showinfo("Information", "Record Updated Successfully!")
 
       e1.delete(0, END)
       e2.delete(0, END)
       e3.delete(0, END)
       e4.delete(0, END)
       e1.focus_set()
 
    except Exception as e:
 
       print(e)
       mysqldb.rollback()
       mysqldb.close()
 
def delete():
    studid = e1.get()
 
    mysqldb=mysql.connector.connect(host="localhost",user="root",password="",database="payroll")
    mycursor=mysqldb.cursor()
 
    try:
       sql = "delete from registration where id = %s"
       val = (studid,)
       mycursor.execute(sql, val)
       mysqldb.commit()
       lastid = mycursor.lastrowid
       messagebox.showinfo("Information", "Record Delete Successfully!")
 
       e1.delete(0, END)
       e2.delete(0, END)
       e3.delete(0, END)
       e4.delete(0, END)
       e1.focus_set()
 
    except Exception as e:
 
       print(e)
       mysqldb.rollback()
       mysqldb.close()
 
def show():
        mysqldb = mysql.connector.connect(host="localhost", user="root", password="", database="payroll")
        mycursor = mysqldb.cursor()
        mycursor.execute("SELECT id,empname,mobile,salary FROM registration")
        records = mycursor.fetchall()
        print(records)
 
        for i, (id,stname, course,fee) in enumerate(records, start=1):
            listBox.insert("", "end", values=(id, stname, course, fee))
            mysqldb.close()
 
root = Tk()
root.title("Activity 4 SIA || Cailing, Cadalo")
root.geometry("820x500")
root.configure(bg='#6096B4')
root.resizable('False', 'false')
global e1
global e2
global e3
global e4
 
 
tk.Label(root, text="Staff ID", background = "#6096B4",).place(x=250, y=10)
e1 = Entry(root)
e1.place(x=380, y=10)

Label(root, text="Staff Name",  background = "#6096B4",).place(x=250, y=40)
e2 = Entry(root)
e2.place(x=380, y=40)

Label(root, text="Mobile#",  background = "#6096B4",).place(x=250, y=70)
e3 = Entry(root)
e3.place(x=380, y=70)
 
Label(root, text="Salary",  background = "#6096B4",).place(x=250, y=100)
e4 = Entry(root)
e4.place(x=380, y=100)
 
Button(root, text="ADD", background = "#B0DAFF", command = Add,height=3, width= 13).place(x=250, y=130)
Button(root, text="UPDATE", background = "#B9E9FC", command = update,height=3, width= 13).place(x=380, y=130)
Button(root, text="DELETE",background = "#DAF5FF", command = delete,height=3, width= 13).place(x=500, y=130)
 
cols = ('emp_id', 'emp_name', 'mobile','salary')
listBox = ttk.Treeview(root, columns=cols, show='headings')
 
for col in cols:
   
    listBox.heading(col, text=col)
    listBox.grid(row=1, column=0, columnspan=2)
    listBox.place(x=10, y=200)
 
show()
listBox.bind('<Double-Button-1>', GetValue)

tk.Label(root, text="Staff Registration",  background = "#6096B4", fg="black", font= 'Calibri 35 bold').place(x=240, y=430)
 
root.mainloop()
