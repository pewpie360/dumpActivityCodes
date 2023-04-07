# Import required Libraries
import os
from tkinter import *
from PIL import Image, ImageTk
import cv2

#Login with camera
#change directory lang sa local directory sa python
#1st: python -m pip install pillow
#2nd: python -m pip install opencv-python
#3rd(open the python file/code): python filename.py

# Create an instance of TKinter Window or frame
win = Tk()
# Set the size of the window
win.geometry("450x300")
win.title("Activity 5")

# Create a Label to capture the Video frames
label = Label(win)
label1 = Label(win, text="Username: ", font=("Times New Roman", 12))
label2 = Label(win, text="Password: ", font=("Times New Roman", 12))

label1.grid(row=0, column=1)
label2.grid(row=1, column=1)

label.grid(row=0, column=0, rowspan=2) #image

e1 = Entry(win)
e2 = Entry(win, show='*')
# this will arrange entry widgets
e1.grid(row = 0, column = 2, pady = 3)
e2.grid(row = 1, column = 2, pady = 3)

# Define function to save image
def save_image():
    global img

    # Get the latest frame and convert into Image
    cv2image = cv2.cvtColor(cap.read()[1], cv2.COLOR_BGR2RGB)
    img = Image.fromarray(cv2image)

    # Define the image path
    img_path = os.path.join(os.getcwd(), "captured_image.png")

    # Save the image to the defined path
    img.save(img_path)

    # Print success message
    print("Image saved successfully!")

def show_frames():
   cv2image = cv2.cvtColor(cap.read()[1], cv2.COLOR_BGR2RGB)
   img = Image.fromarray(cv2image)
   img = img.resize((200, 200))

   # Convert image to PhotoImage
   imgtk = ImageTk.PhotoImage(image=img)
   label.imgtk = imgtk
   label.configure(image=imgtk)

   # Repeat after an interval to capture continiously
   label.after(20, show_frames)

button1 = Button(win, text="Exit", height=1, width=10, font =('Times New Roman', 12), command=exit)
button1.grid(row=2,column=2)

button2 = Button(win, text="Login", bg='#54FA9B', height=1, width=10, font =('Times New Roman', 12))
button2.grid(row=2,column=0)

button3 = Button(win, text="Save", bg='brown', height=1, width=10, font =('Times New Roman', 12), command=save_image)
button3.grid(row=2,column=1)

cap= cv2.VideoCapture(0)
show_frames()
win.mainloop()
