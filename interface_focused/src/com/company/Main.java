package com.company;

public class Main {
    interface IEncrypt{
        void encrypt();
        void decrypt();
    }

    interface ICompress{
        void compress();
        void decompress();
    }

    interface IAuthenticate{
        void login();
        void logout();
    }

    static class focusedview implements IEncrypt,ICompress,IAuthenticate{
        @Override public void encrypt(){
            System.out.println(">>encrypt");
        }
        @Override public void decrypt(){
            System.out.println(">>decrypt");
        }

        @Override public void compress(){
            System.out.println(">>compress");
        }
        @Override public void decompress(){
            System.out.println(">>decompress");
        }

        @Override public void login(){
            System.out.println(">>login");
        }
        @Override public void logout(){
            System.out.println(">>logout");
        }
    }

    public static void main(String[] args) {
	focusedview o=new focusedview();
	IEncrypt ie=o;
	ie.encrypt();
	ie.decrypt();

	ICompress ic=o;
	ic.compress();
	ic.decompress();

	IAuthenticate ia=o;
	ia.login();
	ia.logout();
    }
}
