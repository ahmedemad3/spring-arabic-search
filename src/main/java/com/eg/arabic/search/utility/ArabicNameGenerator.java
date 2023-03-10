package com.eg.arabic.search.utility;

import java.util.Random;

public class ArabicNameGenerator {
	
	private static final String[] FIRST_NAMES = {
	        "محمد", "علي", "أحمد", "حسن", "عبدالله", "سعد", "سليمان", "عبدالرحمن", "مصطفى", "يوسف", "عمر", "مروان",
	        "عماد", "أيمن", "خالد", "صالح", "ناصر", "جمال", "فهد", "أسامة", "محمود", "وليد", "رامي", "مؤيد",
	        "إبراهيم", "منصور", "عبدالعزيز", "أحمد", "عمران", "مراد", "إسماعيل", "زياد", "حسام", "محمد", "سهيل",
	        "يوسف", "صابر", "محمد", "عماد", "بلال", "ماهر", "فهد", "علي", "حسن", "أحمد", "عثمان", "جميل",
	        "محمد", "عبدالله", "أحمد", "نايف", "فيصل", "عبدالمجيد", "أشرف", "عبدالمحسن", "إسلام", "خالد", "عمر", "ياسر"
	    };
	    
	    private static final String[] LAST_NAMES = {
	        "علي", "حسين", "أحمد", "عبدالله", "سعد", "عبدالرحمن", "محمد", "يوسف", "صالح", "عماد", "خالد",
	        "فهد", "ناصر", "جمال", "أسامة", "محمود", "رامي", "مؤيد", "منصور", "أحمد", "زياد", "حسام", "سهيل",
	        "صابر", "بلال", "فهد", "محمد", "جميل", "عمران", "إسماعيل", "أشرف", "محمد", "ياسر", "عبدالله",
	        "سليمان", "مصطفى", "مروان", "إبراهيم", "عماد", "وليد", "عبدالعزيز", "رامز", "باسل", "ماهر",
	        "علي", "حسن", "محمد", "عثمان", "فيصل", "عبدالمجيد", "عبدالمحسن", "إسلام", "نايف"
	    };
	    
	    
	    public static String generateFirstName() {
	        Random rand = new Random();
	        int firstNameIndex = rand.nextInt(FIRST_NAMES.length);
	        return FIRST_NAMES[firstNameIndex];
	    }
	    
	    public static String generateLastName() {
	        Random rand = new Random();
	        int lastNameIndex = rand.nextInt(LAST_NAMES.length);
	        return LAST_NAMES[lastNameIndex];
	    }

}
