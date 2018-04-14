package com.xuke.demo.pork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Pork2 {

	public static void main(String[] args) {
		// 1、组装一副牌
		//梅花、方片、黑桃、红桃(♠♥♦♣)等特殊字符
		//2,A,K,Q,J,10,9,8,7,6,5,4,3
		//存放花色
		List<String> colorList=new ArrayList<>();
		colorList.add("♦");
		colorList.add("♣");
		colorList.add("♠");
		colorList.add("♥");
		
		//存放纸牌数字
		List<String> numList=new ArrayList<>();
		for(int i=15;i>=3;i--) {
			if(i==15) {
				numList.add("2");
			}else if(i==14) {
				numList.add("A");
			}else if(i==13) {
				numList.add("K");
			}else if(i==12) {
				numList.add("Q");
			}else if(i==11) {
				numList.add("J");
			}else {
				numList.add(""+i);
			}
		}
		
		//测试输出numList值
		//把数字与花色连接起来
		List<String> pkList=new ArrayList<>();
		for(String color:colorList) {
			for(String num:numList) {
				pkList.add(color+num);
			}
		}
		//添加大王，小王
		pkList.add(0, "小王");
		pkList.add(0, "大王");
		
		//测试输出牌
		for(String pk:pkList) {
			System.out.println(pk);
		}
		//end 组装牌结束
		//考虑怎么发牌，定位一张牌
//		System.out.println(1%3);
//		System.out.println(2%3);
//		System.out.println(3%3);
//		System.out.println(4%3);
//		System.out.println(5%3);
//		System.out.println(6%3);
		//打乱牌的顺序
		Collections.shuffle(pkList);
		//把打乱顺序后的牌与数字建立对应关系，用来发牌用
		Map<Integer,String> pkNumMap=new HashMap<>();
		int i=1;
		for(String pk:pkList) {
			pkNumMap.put(i, pk);
			i++;
		}
		
		//开始发牌。。注意：我发得是数字，不是真正的牌
		//真正的牌是通过我发的数字进行获取
		//建立玩家1,2,3List，存放发放的数字
		Set<String> pkerList1=new TreeSet<>(new PorkSort());
		Set<String> pkerList2=new TreeSet<>(new PorkSort());
		Set<String> pkerList3=new TreeSet<>(new PorkSort());
		Set<String> lastList4=new TreeSet<>(new PorkSort());
		//发数字给玩家,保留最后3个数字，即只需发51个数字即可
		for(int j=1;j<=54;j++) {
			if(j>51) {
				//底牌
				lastList4.add(pkNumMap.get(j));
			}else {
				if(j%3==1) {
					//玩家1
					pkerList1.add(pkNumMap.get(j));
				}else if(j%3==2) {
					//玩家2
					pkerList2.add(pkNumMap.get(j));
				}else {
					//玩家3
					pkerList3.add(pkNumMap.get(j));
				}
			}
			
		}
		
		//输出所有玩家的牌及底牌
		System.out.println("==============");
		System.out.println("玩家1的牌为：");
		for (String itg : pkerList1) {
			System.out.print(itg+",");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("玩家2的牌为：");
		for (String itg : pkerList2) {
			System.out.print(itg+",");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("玩家3的牌为：");
		for (String itg : pkerList3) {
			System.out.print(itg+",");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("底牌为：");
		for (String itg : lastList4) {
			System.out.print(itg+",");
		}
		System.out.println();
		System.out.println("======结束========");
	}

}


class PorkSort implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		//对牌进行排序
		if(parseStringToNum(s1)>parseStringToNum(s2)) {
			return -1;
		}else {
			return 1;
		}
	}
	
	//把牌转成数字2->
	//梅花、方片、黑桃、红桃(♠♥♦♣)
	//方片♦=1,梅花♣=2,红桃♥=3,黑桃♠=4,(大小王的花色)=5
	//2=15,A=14,K=13,Q=12
	//为了错开两个牌面之间的最小值和最大值，都乘以本身。
	public int parseStringToNum(String s) {
		if("大王".equals(s)) {
			return 17*17+5;
		}
		if("小王".equals(s)) {
			return 16*16+5;
		}
		int cTemp=0;
		String s1Color=s.substring(0, 1);
		switch (s1Color) {
			case "♦":
				cTemp=1;
				break;
			case "♣":
				cTemp=2;
				break;
			case "♥":
				cTemp=3;
				break;
			case "♠":
				cTemp=4;
				break;
			default:
				break;
		}
		String s1Num=null;
		if(s.length()==3) {
			s1Num=s.substring(1, 3);
		}else {
			s1Num=s.substring(1, 2);
		}
		int nTemp=0;
		switch (s1Num) {
			case "2":
				nTemp=15;
				break;
			case "A":
				nTemp=14;
				break;
			case "K":
				nTemp=13;
				break;
			case "Q":
				nTemp=12;
				break;
			case "J":
				nTemp=11;
				break;
			default:
				nTemp=Integer.parseInt(s1Num);
				break;
		}
		return nTemp*nTemp+cTemp;
	}
}
