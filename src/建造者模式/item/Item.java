package 建造者模式.item;

import 建造者模式.packing.Packing;

/**
 * 食物条目接口<br>
 * 类名：Item<br>
 * 作者： mht<br>
 * 日期： 2018年9月30日-上午11:38:07<br>
 */
public interface Item {
    /** 食物名称*/
    String name();
    /** 包装*/
    Packing packing();
    /** 总价*/
    float price();
}
