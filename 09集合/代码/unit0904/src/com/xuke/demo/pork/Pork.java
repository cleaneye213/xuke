package com.xuke.demo.pork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pork {

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
		List<Integer> pkerList1=new ArrayList<>();
		List<Integer> pkerList2=new ArrayList<>();
		List<Integer> pkerList3=new ArrayList<>();
		
		List<Integer> lastList4=new ArrayList<>();
		//发数字给玩家,保留最后3个数字，即只需发51个数字即可
		for(int j=1;j<=54;j++) {
			if(j>51) {
				//底牌
				lastList4.add(j);
			}else {
				if(j%3==1) {
					//玩家1
					pkerList1.add(j);
				}else if(j%3==2) {
					//玩家2
					pkerList2.add(j);
				}else {
					//玩家3
					pkerList3.add(j);
				}
			}
			
		}
		
		//输出所有玩家的牌及底牌
		System.out.println("==============");
		System.out.println("玩家1的牌为：");
		Collections.sort(pkerList1);
		for (Integer itg : pkerList1) {
			System.out.print(pkNumMap.get(itg)+",");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("玩家2的牌为：");
		Collections.sort(pkerList2);
		for (Integer itg : pkerList2) {
			System.out.print(pkNumMap.get(itg)+",");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("玩家3的牌为：");
		Collections.sort(pkerList3);
		for (Integer itg : pkerList3) {
			System.out.print(pkNumMap.get(itg)+",");
		}
		System.out.println();
		System.out.println("==============");
		System.out.println("底牌为：");
		Collections.sort(lastList4);
		for (Integer itg : lastList4) {
			System.out.print(pkNumMap.get(itg)+",");
		}
		System.out.println();
		System.out.println("======结束========");
	}

}
