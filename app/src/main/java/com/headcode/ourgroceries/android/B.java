package com.headcode.ourgroceries.android;

import android.content.Context;
import s5.EnumC6746l;

/* loaded from: classes2.dex */
public enum B {
    NO_CHANGE,
    FROM_ASK_TO_LEAVE,
    FROM_GUESS_TO_LEAVE,
    TO_GUESS;

    public static B c(EnumC6746l enumC6746l, EnumC6746l enumC6746l2) {
        if (enumC6746l == enumC6746l2) {
            return NO_CHANGE;
        }
        EnumC6746l enumC6746l3 = EnumC6746l.AC_LEAVE;
        return (enumC6746l2 == enumC6746l3 && enumC6746l == EnumC6746l.AC_ASK) ? FROM_ASK_TO_LEAVE : (enumC6746l2 == enumC6746l3 && enumC6746l == EnumC6746l.AC_GUESS) ? FROM_GUESS_TO_LEAVE : enumC6746l2 == EnumC6746l.AC_GUESS ? TO_GUESS : NO_CHANGE;
    }

    public String f(Context context) {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return context.getString(M2.f34221x4);
        }
        if (ordinal == 2) {
            return context.getString(M2.f34229y4);
        }
        if (ordinal != 3) {
            return null;
        }
        return context.getString(M2.f34237z4);
    }
}
