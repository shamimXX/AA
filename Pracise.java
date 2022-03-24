package com.Pracise;

import java.util.Scanner;

public class Pracise {

	public Pracise() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	
		
		

		int N, M, sum = 0 ;
		boolean perfect=false ;
		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			M = sc.nextInt();
			
			for (int j=1;j<M;j++) {
				if( M % j == 0) {
					
					sum+=j;
			
				}
				
			}	
		
			if(sum==M) {
				perfect=true;
				
			}else {
				perfect=false;
			}
			sum=0;
			
			if(perfect) {
				System.out.println(M+" eh perfeito");
			}else {
				System.out.println(M+" nao eh perfeito");
			}
		}
		
		

//		int N,X,j;
//		
//		N=sc.nextInt();
//		
//		for (int i=1;i<=N;i++) {
//			
//			X=sc.nextInt();
//			
//			boolean isPrim=true;
//			
//			for (j=2 ; j<X; j++) {
//				if(X % j == 0) {
//					isPrim=false;
//					
//				}
//				
//			}
//			
//			if(isPrim) {
//				System.out.println(X+ " eh primo");
//			}else {
//				System.out.println(X+ " nao eh primo");
//			}
//			
//		}
//		

//		int N,X;
//		
//		N=sc.nextInt();
//		
//		for(int i=1;i<=N;i++) {
//			
//			
//			X=sc.nextInt();
//			boolean isPrim=true;
//			for (int  j=2;j<X;j++) {
//				if(N%X==0) {
//					isPrim=false;
//				}
//			}
//			if(isPrim) {
//				System.out.println(N+" eh primo");
//			}else {
//				System.out.println(N+" nao eh primo");
//			}
//			
//		}
//		

//		int N=sc.nextInt();
//		
//		for (int i=1;i<=N;i++) {
//			
//			if(N%i==0) {
//				System.out.println(i);
//			}
//		}
//	
//		
//		float S = 0;
//		for (float i = 1; i <= 100; i++) {
//			S += (1 / i);
//		}
//		System.out.printf("%.2f\n",S);

		// Done 1141
//	int age,totalN=0,totalAge=0;
//	
//	float average;
//	
//	while(((age=sc.nextInt())>=0)) {
//		totalAge+=age;
//		totalN+=1;
//	}
//		
//		average = (float)((float)totalAge / (totalN));
//	System.out.printf("%.2f",average);
//	
//	
//	

		// Done
//		double R=sc.nextDouble();
//		
//		double result=3.14159*(R*R);
//		System.out.printf("A=%.4f \n",result);
//		
		// 1011 Done
//		double R;
//		R=sc.nextDouble();
//		
//		double result=(4/3.0)*3.14159*(R*R*R);
//		  System.out.printf("VOLUME = %.3f\n", (4 * 3.14159 * Math.pow(R, 3.0)) / 3);
//		  
//		

		// Done
//		int N=sc.nextInt();
//		int c,d,e,f;
//		if(N>1 && N<1000) {
//			for (int i=1;i<=5;i++) {
//				c=i*i;
//				d=i*i*i;
//				
//				System.out.print(i+" "+c+" "+d+"\n");
//				
//				e=c+1;
//				f=d+1;
//				System.out.print(i+" "+e+" "+f+"\n");
//				
//				
//				
//			}
//		}
//	

		// Done
//		
//		int N=sc.nextInt();
//		
//		if(N>1 && N <1000) {
//			for (int i=1;i<=N;i++) {
//				System.out.print(i+" "+i*i+" "+i*i*i+"\n");
//				
//				
//			}
//		}
//			for (int j=1;j<=N;j++) {
//				System.out.println(j*j+" ");
//			}
//			for(int o=1;o<=N;o++) {
//				System.out.println(o*o*o+" ");
//			}
//		}

//			b=sc.nextInt();
//		int j=0;
//		while(b<0 || b==0) 
//			b=sc.nextInt();
//			for (int i=0;i<b;i++) {
//				j=j+a+i;
//			}
//			System.out.println(j);
//			

//		
//		
//		
//		
//		System.out.println("hello");
//			
//		int a,b;

//		a=sc.nextInt();

		// dONE
		// int x,y;
		// y=sc.nextInt();

//		for (int i=1;i<=y;i++) {
//			x=sc.nextInt();
//			if(x>0) {
//				if (x%2==0) {
//					System.out.println("EVEN POSITIVE");
//				}else {
//					System.out.println("ODD POSITIVE");
//				}
//				
//			}else if(x<0) {
//				if (x%2!=0) {
//					System.out.println("ODD NEGATIVE");
//				}else {
//					System.out.println("EVEN NEGATIVE");
//				}
//			}else if(x==0) {
//				System.out.println("NULL");
//			}
//			
//		
//		}

//		int X;
//		while(true) {
//			X=sc.nextInt();
//			
//			if(X==0) {
//				break;
//			}
//			
//			else{
//				for(int x=1;x<X;x++) {
//					
//					System.out.print(x+" ");
//			}
//				System.out.println(X);
//				
//			}
//			
//		}

		// Done
//		int N;
//		N=sc.nextInt();
//		
//		int cont=1;
//		for (int i=1;i<=N;i++) {
//
//			for (int j=0;j<3;j++) {
//				System.out.print(cont+" ");
//				cont++;
//				
//			}
//			
//			System.out.println("PUM");
//			cont++;		
//		
//					
//		}
//		int I,J,a=7,b;
//		for (I=1;I<=9;I=I+2) {
//			for (b=1,J=a;b<=3;J--,b++) {
//				System.out.println("I="+I+ " J="+J);
//				
//			}
//			a=a+2;
//			
//		}

		// Done
//		int a,b,c,d;
//		a=b=c=d=0;
//		while(true) {
//		a=sc.nextInt();	
//		
//		if(a==1) {
//			b+=1;
//		}else if(a==2) {
//			c+=1;
//		}else if(a==3) {
//			d+=1;
//		}else if(a==4) {
//			break;
//		}
//		
//			
//			
//		}
//		System.out.println("MUITO OBRIGADO\n" + "Alcool: "+b+"\n"+ "Gasolina: "+c+ " \n"+ "Diesel: "+d);	
//		
//		

		// Done
//		int X,Y,sum=0;
//		X=sc.nextInt();
//		Y=sc.nextInt();
//		
//	if(X>Y) {
//		for (int i=Y+1;i<X;i++) {
//			if(i%5==2 || i%5==3) {
//				System.out.println(i);
//			}
//		}
//	}else if(X<Y) {
//		for (int j=X+1;j<Y;j++) {
//			if(j%5==2 || j%5==3) {
//				System.out.println(j);
//			}
//		}
//	}
		// Done
//		int X,Y,sum=0;
//		
//		X=sc.nextInt();
//		Y=sc.nextInt();
//		
//		if(X<Y) {
//			for(X=X;X<=Y;X++) {
//				if(X%13!=0) {
//					sum+=X;
//				}System.out.println(X);
//			}
//			
//			
//		}else if(X>Y) {
//			for(Y=Y;Y<=X;Y++) {
//				if(Y%13!=0) {
//					sum+=Y;
//				}
//			}System.out.println(sum);
//		}else if(X==Y) {
//			sum=0;
//			System.out.println(sum);
//		}

//		int x=sc.nextInt();
//		int j,k;
//		
//		for (int i=1;i<=x;i++) {
//			
//		
//			j=sc.nextInt();
//			k=sc.nextInt();
//			
//			
//			if(k==0) {
//				System.out.println("divisao impossivel");
//			}else {
//			
//				System.out.println((double)j/k);
//			}
//			
//		}
//		
		// Done
//		while(true) {
//			
//		int pass=2002,num;
//		
//		while ((num=sc.nextInt()) !=pass){
//			System.out.println("Senha Invalida");
//		}
//		
//		System.out.println("Acesso Permitido");
//		break;
//			
//		}
//		

		// Done
//		while(true) {
//			
//			int x,y;
//			
//			x=sc.nextInt();
//			y=sc.nextInt();
//			
//			if(x==y) {
//				break;
//			}else if(x>y) {
//				System.out.println("Decrescente");
//			}else if(x<y) {
//				System.out.println("Crescente");
//			}
//			
//			
//		}
//		

		// Not Done
//		int X,Y;
//		
//		
//		
//		while (((X=sc.nextInt())>0) && ((Y=sc.nextInt())>0)) {
//			
//			int sum=0;
//			if(X>Y) {
//				for ( Y=Y;Y<=X;Y++) {
//					sum+=Y;
//					System.out.println(Y+" ");
//				}
//				System.out.println("Sum = "+sum+"\n");
//			}else {
//				for (X=X;X<=Y;X++) {
//					sum+=X;
//					System.out.println(X+" ");
//				}
//				System.out.println("Sum = "+sum+"\n");
//			}
//			
//		}

//		boolean t=true;
//		int sum=0;
//		while(t) {
//			if(M <=0 && N<=0) {
//				t=false;
//			}
//			
//				for (int i=N;i<=M;i++) {
//					if(i<=M) {
//						System.out.println(i);
//						sum+=i;
//					}
//		}System.out.println(sum);
//				
//		}
//		

		// Done
//		int N;
//		int start,end;
//		
//		N=sc.nextInt();
//		for (int i=1;i<=N;i++) {
//			
//			int odd=0;
//			
//			start=sc.nextInt();
//			end=sc.nextInt();
//			
//			if(start>end) {
//				for (int j=start-1;j>end;j--) {
//					if(j%2!=0) {
//						odd+=j;
//					}
//				}
//			}else if(start<end) {
//				for (int k=start+1;k<end;k++) {
//					if(k%2!=0) {
//						odd+=k;
//					}
//				}
//			}else {
//				odd=0;
//			}
//			System.out.println(odd);
//			
//		}

//     int I,J,a=7,b;
//         
//         for (I=1;I<=9;I=I+2){
//             for (b=1,J=a;b<=3;b++,J--){
//                 System.out.println("I="+I+ " J="+J);
//             }
//             a=a+2;
//         }

		// Done
//		int I,J,a=7,b;
//		for (I=1;I<=9;I=I+2) {
//			for (b=1,J=a;b<=3;J--,b++) {
//				System.out.println("I="+I+ " J="+J);
//				
//			}
//			a=a+2;
//			
//		}

		// Done
//		int I,J;
//		for (I=1;I<=9;I=I+2) {
//			for (J=7;J>=5;J--) {
//				System.out.println("I="+I+ " J="+J);
//			}
//		}
//		

		// Done
//		int i,j;
//		for (i=1,j=60;j>=0;i=i+3,j=j-5) {
//			System.out.println(i+"  "+j);
//			
//		}
//		
//		

//		int n=0;
//		
//		int a=0;
//		char c;
//		int rabbit=0, rat = 0, frog = 0;
//		while(true) {
//			
//			a=sc.nextInt();
//			c=sc.next().charAt(0);
//			if(c=='c') {
//				rabbit+=a;
//			}else if(c=='r') {
//				rat+=n;
//			}else if(c=='s') {
//				frog+=n;
//			}
//			
//			System.out.println("total rabbit "+rabbit+" total rat "+rat+" total frog"+frog);
//			
//			
//			
//		}

		// Done
//		int a=0,highest=0,position=0,X=4;
//		for (int i=1;i<=X;i++) {
//			a=sc.nextInt();
//			
//			if(highest>a) {
//				highest=highest;
//				position=position;
//				
//			}else {
//				highest=a;
//				position=i;
//			}
//			
//			
//		}
//		System.out.print(highest+" \n"+position+"\n");

//		
//		float a,b,c;
//		double result=0;
//		int N=sc.nextInt();
//	
//		for (int i=1;i<=N;i++) {
//			a=sc.nextFloat();
//			b=sc.nextFloat();
//			c=sc.nextFloat();
//			result=((a*2)+(b*3)+(c*5))/(2+3+5);
//			System.out.printf("%.1f\n",result);
//			
//		}
//		

//		Done
//		int N=sc.nextInt();
//		if(N>2 &&N<1000) {
//			for (int i=1;i<=10;i++) {
//				System.out.println(i+"x"+N+" = "+i*N);
//			}
//			
//		}

		// done
//		int N=sc.nextInt();
//		for (int i=1;i<10000;i++) {
//			if(i%N==2) {
//				System.out.println(i);
//			}
//		}
//		
//		

//		not done
//	int N,a;
//	N=sc.nextInt();
//	for(int i=0;i<N;i++) {
//		a=sc.nextInt();
//		
//		if(a==0) {
//			System.out.println("NULL");
//		}else if(a%2==0 && a<0) {
//			System.out.println("EVENT NEGATIVE");
//		}else if(a%2==0 && a>0){
//			System.out.println("EVENT POSITIVE");
//		}else if(a%2!=0 && a<0) {
//			System.out.println("ODD NEGATIVE");
//		}else if(a%2!=0 && a>0) {
//			System.out.println("ODD NEGATIVE");
//		}
//		
//	}
		// done
//		int N=sc.nextInt();
//		
//		if(N>=5 && N<=2000) {
//			for (int i=1;i<=N;i++) {
//				if(i%2==0) {
//					System.out.println(i+"^"+2+" = "+i*i);
//				}
//				
//			}
//		}
//		

//		int in=0,out=0,X;
//		
//		int N=sc.nextInt();
//		
//		
//		
//		
//		for (int i=1;i<=N;i++) {
//		X=sc.nextInt();
//			if(X>=10 && X<=20) {
//				in+=1;
//				
//			}else {
//				out+=1;
//			}
//		}
//		System.out.printf(in+" in\n"+out+" out\n");
//		

//		int x,y,sum=0,i;
//		int max,min;
//		x=sc.nextInt();
//		y=sc.nextInt();
//		
//		if(x>y) {
//			min=y;
//			max=x;
//		}else {
//			min=x;
//			max=y;
//		}
//		
//		for (i=(min+1);i<max;++i) {
//			if(i%2!=0) {
//				sum+=i;
//			}
//		}
//		System.out.printf(sum+"\n");
//		int x,y;
//		int total=0;
//		x=sc.nextInt();
//		y=sc.nextInt();
//		
//		int z=0;
//		
//		if(x>y) {
//			for (int i=x-1;i>y;i--) {
//				if(i%2!=0) {
//					total+=i;
//				}
//			}
//		}else {
//			for (int i=y-1;y>x;y--) {
//				if(i%2!=0) {
//					total+=i;
//				}
//			}
//		}
//		
//		
//		
//		System.out.println(total+"\n");
//		
//		

		// not done
//		float N1,N2,N3,N4;
//		N1=sc.nextFloat();
//		N2=sc.nextFloat();
//		N3=sc.nextFloat();
//		N4=sc.nextFloat();
//		N1=N1*2;
//		N2=N2*3;
//		N3=N3*4;
//		N4=N4*1;
//		
//		double result=(N1+N2+N3+N4)/(2+3+4+1);
//
//		if(result>=7.0) {
//			System.out.printf("Media: %.1f",result);
//			System.out.println("Aluno em exame");
//			
//		}
//		if(result>=5.0) {
//			System.out.println("Aluno aprovado.");
//		}
//		else {
//			System.out.println("Aluno reprovado.");
//		}
//		System.out.printf("Media final: %.1f\n",);
//		if(result>=5.0 && result<=6.9) {
//			System.out.println("Aluno exame");
//		}
//		
//		double A,B,C;
//		
//		A=sc.nextDouble();
//		B=sc.nextDouble();
//		C=sc.nextDouble();
//		
//		A=A*2;
//		B=B*3;
//		C=C*5;
//		double result =(A+B+C)/(3+2+5);
//		System.out.printf("MEDIA = %.1f",result);
//
//		

//		float A,B;
//		
//		
//		A=sc.nextFloat();
//		B=sc.nextFloat();
//		
//		double result=(A*3.5+B*7.5)/(3.5+7.5);
//		
//		System.out.printf("MEDIA = %.5f",result,"\n");
//		
//		
//		

//		int a,even=0,odd=0,posi=0,negative=0;
//		for (int i=1;i<=5;i++) {
//			a=sc.nextInt();
//			
//			if(a %2==0) {
//				even++;
//			}
//			if(a%2 !=0) {
//				odd++;
//			}
//			if(0<a) {
//				posi++;
//			}
//			if(0>a) {
//				negative++;
//			}
//		
//		}
//		
//		
//		System.out.println(even);
//		System.out.println("odd"+odd);
//		System.out.println("posi "+ even);
//		System.out.println("nega "+even);
//		
//		

//		int a,total=0;
//		for (int i=1;i<=5;i++) {
//			a=sc.nextInt();
//			if(a%2==0) {
//				total+=1;
//				
//			}
//		}
//		System.out.println(total+" valors pares");
//		

//		float n,total=0,average=0;
//		int totalNum=0;
//		for(int i=1;i<=6;i++) {
//			n=sc.nextFloat();
//			if(n>0) {
//				totalNum+=1;
//				total+=n;
//				
//			}
//		}
//		average=total/totalNum;
//		System.out.print(totalNum+ " valores positivos\n");
//		System.out.printf("%.1f\n",average);
//		

//		double a;
//		int sum=0;
//		for (int i=1;i<=6;i++) {
//			a=sc.nextInt();
//			if(a>0) {
//				sum +=1;
//			}
//		}
//		System.out.println(sum+" valores positivos");
//		

//		for (int i=1;i<=100;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//		

//		
//		int n=sc.nextInt();
//		
//		if (n==1) {
//			System.out.println("January");
//		}else if(n==2) {
//			System.out.println("February");
//		}else if(n==3) {
//			System.out.println("March");
//		}else if(n==4) {
//			System.out.println("April");
//		}else if(n==5) {
//			System.out.println("May");
//		}else if(n==6) {
//			System.out.println("June");
//		}else if(n==7) {
//			System.out.println("July");
//		}else if(n==8) {
//			System.out.println("August");
//		}else if(n==9) {
//			System.out.println("September");
//		}else if(n==10) {
//			System.out.println("October");
//		}else if(n==11) {
//			System.out.println("November");
//		}else if(n==12) {
//			System.out.println("December");
//		}
//		
//		
//		switch(n) {
//		case 1:
//			System.out.println("January");
//			break;
//			
//		case 2:
//			System.out.println("February");
//			break;
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		case 5:
//			System.out.println("May");
//			break;
//		case 6:
//			System.out.println("June");
//			break;
//		case 7:
//			System.out.println("July");
//			break;
//		case 8:
//			System.out.println("August");
//			break;
//		case 9:
//			System.out.println("September");
//			break;
//		case 10:
//			System.out.println("October");
//			break;
//		case 11:
//			System.out.println("November");
//			break;
//		case 12:
//			System.out.println("December");
//			break;
//		}
//		

//		double A,B,C;
//		
//		A=sc.nextDouble();
//		B=sc.nextDouble();
//		C=sc.nextDouble();
//		String s=String.format("TRIANGULO: %.3f",0.5*A*C );
//		System.out.println(s);
//		String s1=String.format("CIRCULO: %.3f",Math.PI*(C*C) );
//		System.out.println(s1);
//		
//		String s2=String.format("TRAPEZIO: %.3f",(A+B)/2*C);
//		
//		System.out.println(s2);
//		
//		String s3=String.format("QUADRADO: %.3f",B*B );
//		
//		System.out.println(s3);
//		String s4=String.format("RETANGULO: %.3f",A*B );
//		
//		System.out.println(s4);
//		
//		

//		double m;
//		double n=sc.nextFloat();
//		if(n>=0 && n<=2000.00) {
//			
//			System.out.println("Isento");
//		}else if(n>=2000.01 && n <=3000.00) {
//			m=(n-2000.00)*0.08;
//			String s=String.format("R$ %.2f", m);
//			System.out.println(s);
//		}else if(n>=3000.01 && n<=4500.00) {
//			m=(n-3000.00)*(18/100);
//			String s=String.format("R$ %.2f", m);
//			System.out.println(s);
//		}else{
//			m=(n-4000.00)*(28/100);
//			String s=String.format("R$ %.2f", m);
//			System.out.println(s);
//		}

//	
//		
//		int n=sc.nextInt();
//		if(n==11) {
//			System.out.println("Sao Paulo");
//		}else if(n==19) {
//			System.out.println("Campinas");
//		}else if(n==21) {
//			System.out.println("Rio de Janeiro");
//		}else if(n==27) {
//			System.out.println("Vitoria");
//		}else if (n==31){
//			System.out.println("Belo Horizonte");
//		}else if ( n==32) {
//			System.out.println("Juiz de Fora");
//		}else if(n==61) {
//			System.out.println("Brasilia");
//		}else if(n==71) {
//			System.out.println("Salvador");
//		}else{
//		    System.out.println("DDD nao cadastrado");
//		}

//		String s=sc.nextLine();
//		
//		if(s.equalsIgnoreCase("vertebrado")) {
//			s=sc.nextLine();
//			if(s.equalsIgnoreCase("ave")) {
//				s=sc.nextLine();
//				if(s.equalsIgnoreCase("carnivoro")) {
//					System.out.println("aguia");
//				}else {
//					System.out.println("pomba");
//				}
//			}else {
//				s=sc.nextLine();
//				if(s.equalsIgnoreCase("onivoro")) {
//					System.out.println("homem");
//				}else {
//					System.out.println("vaca");
//				}
//			}
//			
//		}else {
//			s=sc.nextLine();
//			if(s.equalsIgnoreCase("inseto")) {
//				s=sc.nextLine();
//				if(s.equalsIgnoreCase("hematofago")) {
//					System.out.println("pulga");
//				}else {
//					System.out.println("lagarta");
//				}
//			}else {
//				s=sc.nextLine();
//				
//				if(s.equalsIgnoreCase("hematofago")) {
//					System.out.println("sanguessuga");
//				}else {
//					System.out.println("minhoca");
//				}
//			}
//		}
//		
//		

//		float sallery=0;
//		sallery=sc.nextFloat();
//		float bonus=0;
//		
//		if (sallery>=0 && sallery <=400.00) {
//			
//			bonus=sallery*15/100;
//			sallery+=bonus;
//			String s=String.format("Novo salario: %.2f", sallery);
//			System.out.println(s);
//			String s1=String.format("Reajuste ganho: %.2f" ,bonus);
//			System.out.println(s1);
//			System.out.println("Em percentual: 15 %");
//		}
//		else if (sallery>=400.01 && sallery <=800.00) {
//			
//			bonus=sallery*12/100;
//			sallery+=bonus;
//			String s=String.format("Novo salario: %.2f", sallery);
//			System.out.println(s);
//			String s1=String.format("Reajuste ganho: %.2f" ,bonus);
//			System.out.println(s1);
//			System.out.println("Em percentual: 12 %");
//		}
//		else if (sallery>=800.01 && sallery <=1200.00) {
//			
//			bonus=sallery*10/100;
//			sallery+=bonus;
//			String s=String.format("Novo salario: %.2f", sallery);
//			System.out.println(s);
//			String s1=String.format("Reajuste ganho: %.2f" ,bonus);
//			System.out.println(s1);
//			
//			System.out.println("Em percentual: 10 %");
//		}
//		else if (sallery>=1200.01 && sallery <=2000.00) {
//			
//			bonus=sallery*7/100;
//			sallery+=bonus;
//			String s=String.format("Novo salario: %.2f", sallery);
//			System.out.println(s);
//			String s1=String.format("Reajuste ganho: %.2f" ,bonus);
//			System.out.println(s1);
//	
//			System.out.println("Em percentual: 7 %");
//		}
//		else {
//			
//			bonus=sallery*4/100;
//			sallery+=bonus;
//			String s=String.format("Novo salario: %.2f", sallery);
//			System.out.println(s);
//			String s1=String.format("Reajuste ganho: %.2f" ,bonus);
//			System.out.println(s1);
//			System.out.println("Em percentual: 4 %");
//		}

//		int iniHour,iniMinute,endHour,endMinute,dif;
//		
//		iniHour=sc.nextInt();
//		iniMinute=sc.nextInt();
//		endHour=sc.nextInt();
//		endMinute=sc.nextInt();
//		
//		dif=((endHour*60 )+endMinute) - ((iniHour*60)+iniMinute) ;
//		
//		if (dif<=0) {
//			dif+=24*60;
//		}
//		System.out.println("O JOGO DUROU "+ dif/60+" HORA(S) E " + dif%60+" MINUTO(S)");
//		(not done)
//		int a,b;
//		
//		a=sc.nextInt();
//		b=sc.nextInt();
//		if (a==b) {
//			System.out.println("O JOGO DUROU " + (24-a+b) + " HORA(S)");
//		}
//		else if (a<b) {
//			System.out.println("O JOGO DUROU " + (b-a) + " HORA(S)");
//		}
//		else if(a>b) {
//			System.out.println("O JOGO DUROU " +(24-a-b) +" HORA (S)");
//		}

//		double a,b,c;
//		a=sc.nextDouble();
//		b=sc.nextDouble();
//		c=sc.nextDouble();
//		
//		if ((a+b)<=c || (b+c)<=a || (c+a)<=b ) {
//			
//			System.out.println("NAO FORMA TRIANGULO");
//		}
//		
//		else if ((a*a) == (b*b + c*c) || (b*b)== (c*c+ a*a) || (c*c)==(a*a+b*b) ) {
//			System.out.println("TRIANGULO RETANGULO");
//			
//		}
//		else if ((a*a)> (b*b) +(c*c) || (b*b)> (c*c+a*a) || (c*c)> (b*b+a*a) ) {
//			System.out.println("TRIANGULO OBTUSANGULO");
//		}
//		
//		else if (a*a< b*b+ c*c || (b*b) < (c*c+a*a) || (c*c)< (b*b + a*a)) {
//			System.out.println("TRIANGULO ACUTANGULO");
//		}
//		if ( a==b && a==c) {
//			System.out.println("TRIANGULO EQUILATERO");
//		}
//		if(a==b && a!=c || a==c && a !=b || b==c && b!=a ) {
//			System.out.println("TRIANGULO ISOSCELES");
//		}

//		
//		int A,B;
//		A=sc.nextInt();
//		B=sc.nextInt();
//		
//		if (B%A==0) {
//			System.out.println("Sao Multiplos");
//		}
//		else {
//			System.out.println("Nao sao Multiplos");
//		}

//		float x,y,z,peri,area;
//		x=sc.nextFloat();
//		y=sc.nextFloat();
//		z=sc.nextFloat();
//		
//		if ((x+y)>z & (y+z)>x & (z+x)>y) {
//			peri=x+y+z;
//			
//			System.out.println("Perimetro = " +peri);
//		}
//		else {
//			area=(float)0.5*(x+y)*z;
//			System.out.println("Area = "+area);
//		}

//		 double a =sc.nextDouble();
//	        double b =sc.nextDouble();
//	        if ((a == 0.0) && b == 0.0) {
//	            System.out.println("Origem");
//	        } else if (a == 0) {
//	            System.out.println("Eixo Y");
//	        } else if (b == 0) {
//	            System.out.println("Eixo X");
//	        } else if ((a > 0) && (b > 0)) {
//	            System.out.println("Q1");
//	        } else if ((a < 0) && (b > 0)) {
//	            System.out.println("Q2");
//	        } else if ((a < 0) && (b < 0)) {
//	            System.out.println("Q3");
//	        } else if ((a > 0) && (b < 0)) {
//	            System.out.println("Q4");
//	        }

//		 double X,Y;
//		X=sc.nextDouble();
//		Y=sc.nextDouble();
//		
//		if (X+Y == 0.0) {
//			System.out.println("Origem");
//		}
//		else if (X==0.0) {
//			System.out.println("Eixo X");
//		}
//		else if (Y==0.0) {
//			System.out.println("Eixo Y");
//		}
//		else if(Y>0 && X>0) {
//			System.out.println("Q1");
//		}
//		else if (Y>0 && X<0) {
//			System.out.println("Q2");
//		}
//		else if (Y<0 && X<0) {
//			System.out.println("Q3");
//		}
//		else if (Y<0 && X<0) {
//			System.out.println("Q4");
//		}

//		float N1=sc.nextFloat();
//		float N2=sc.nextFloat();
//		float N3=sc.nextFloat();
//		float N4=sc.nextFloat();
//		
//		double avg= (N1*2)+(N2*3)+(N3*4)+(N4*1)/10.0;
//		
//		System.out.println(avg);
//		
//		if (avg>=7.0) {
//			System.out.println("Aluno aprovade");
//		}
//		else if(avg<=5.0) {
//			System.out.println("Aluno aprovade");
//		}
//		else if (avg>=5.0 && avg<=6.5) {
//			System.out.println("Aluno em exame");
//		}
//		

//		int X=sc.nextInt();
//		int Y = sc.nextInt();
//		double r=0;
//		
//		
//		if (X==1) {
//			r=Y*4.00;
//			String st1=String.format("Total: R$ %.2f", r);
//			System.out.println(st1);
//			
//		}else if(X==2) {
//			r=Y*4.50;
//			String st2=String.format("Total: R$ %.2f", r);
//			System.out.println(st2);
//			
//		}else if(X==3) {
//			
//	
//			r=Y*5.00;
//			String st3=String.format("Total: R$ %.2f", r);
//			System.out.println(st3);
//			
//		}
//		
//		else if(X==4) {
//			r=Y*2.00;
//			String st4=String.format("Total: R$ %.2f", r);
//			System.out.println(st4);
//			
//		}
//		else if(X==5) {
//			r=Y*1.50;
//			String st5=String.format("Total: R$ %.2f", r);
//			System.out.println(st5);
//			
//		}

//		if (X==1) {
//			r=Y*4.00;
//			System.out.println("Total: R$ "+r);
//		}
//		else if (X==2) {
//			r=Y*4.50;
//			System.out.println("Total: R$ "+r);
//		}
//		else if (X==3) {
//			r=Y*5.00;
//			System.out.println("Total: R$ "+r);
//		}
//		else if (X==4) {
//			r=Y*2.00;
//			System.out.println("Total: R$ "+r);
//		}
//		else if (X==5) {
//			r=Y*1.50;
//			System.out.println("Total: R$ "+r);System.out.println(r);
//		}
//		

//		int A =sc.nextInt();
//		int B=sc.nextInt();
//		int C =sc.nextInt();
//		int D=sc.nextInt();
////		Read 4 integer values A, B, C and D. Then if B is greater than C and D is greater 
////		than A and if the sum of C and D is greater than the sum of A and B and if C and D were positives
////		values and if A is even, write the message “Valores aceitos” (Accepted values). Otherwise,
////		write the message “Valores nao aceitos” (Values not accepted).
//		 if ((B>C && D>A)  && ((C+D)>(A+B)) && ((C & D)>=0) && (A%2==0)) {
//			 
//			 System.out.println("valores aceitos");
//			 
//		 }
//		 else {
//			 System.out.println("valores nao aceitos");
//		 }

	}

}
