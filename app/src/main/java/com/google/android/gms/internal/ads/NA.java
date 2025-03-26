package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: classes.dex */
public abstract class NA {
    public static void a(Spannable spannable, float f8, int i8, int i9, int i10) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i8, i9, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i8 && spannable.getSpanEnd(relativeSizeSpan) >= i9) {
                f8 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i8, i9, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f8), i8, i9, 33);
    }

    public static void b(Spannable spannable, Object obj, int i8, int i9, int i10) {
        for (Object obj2 : spannable.getSpans(i8, i9, obj.getClass())) {
            c(spannable, obj2, i8, i9, 33);
        }
        spannable.setSpan(obj, i8, i9, 33);
    }

    private static void c(Spannable spannable, Object obj, int i8, int i9, int i10) {
        if (spannable.getSpanStart(obj) == i8 && spannable.getSpanEnd(obj) == i9 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
