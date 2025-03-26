package com.headcode.ourgroceries.android;

import java.text.Collator;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class W1 implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    private static final Comparator f34577o = b();

    private static Comparator b() {
        Collator collator = Collator.getInstance();
        collator.setStrength(1);
        collator.setDecomposition(1);
        return collator;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(CharSequence charSequence, CharSequence charSequence2) {
        int i8;
        int i9;
        int compare;
        String charSequence3 = charSequence.toString();
        String charSequence4 = charSequence2.toString();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= charSequence3.length() && i11 >= charSequence4.length()) {
                return 0;
            }
            int i12 = 0;
            while (true) {
                i8 = i10 + i12;
                if (i8 >= charSequence3.length() || Character.isDigit(charSequence3.charAt(i10)) != Character.isDigit(charSequence3.charAt(i8))) {
                    break;
                }
                i12++;
            }
            int i13 = 0;
            while (true) {
                i9 = i11 + i13;
                if (i9 >= charSequence4.length() || Character.isDigit(charSequence4.charAt(i11)) != Character.isDigit(charSequence4.charAt(i9))) {
                    break;
                }
                i13++;
            }
            String substring = charSequence3.substring(i10, i8);
            String substring2 = charSequence4.substring(i11, i9);
            boolean z7 = i12 > 0 && Character.isDigit(substring.charAt(0));
            boolean z8 = i13 > 0 && Character.isDigit(substring2.charAt(0));
            if (z7 && z8) {
                compare = Integer.compare(substring.length(), substring2.length());
                if (compare == 0) {
                    compare = substring.compareTo(substring2);
                }
            } else {
                if (z7) {
                    Comparator comparator = f34577o;
                    if (comparator.compare("0", substring2) <= 0 && comparator.compare(substring2, "9") <= 0) {
                        return -1;
                    }
                }
                if (z8) {
                    Comparator comparator2 = f34577o;
                    if (comparator2.compare("0", substring) <= 0 && comparator2.compare(substring, "9") <= 0) {
                        return 1;
                    }
                }
                compare = f34577o.compare(substring, substring2);
            }
            if (compare != 0) {
                return compare;
            }
            i10 = i8;
            i11 = i9;
        }
    }
}
