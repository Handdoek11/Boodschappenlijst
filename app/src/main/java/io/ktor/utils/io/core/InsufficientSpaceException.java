package io.ktor.utils.io.core;

import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes2.dex */
public final class InsufficientSpaceException extends Exception {
    public InsufficientSpaceException() {
        this((String) null, 1, (AbstractC0650j) (0 == true ? 1 : 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientSpaceException(String str) {
        super(str);
        r.e(str, "message");
    }

    public /* synthetic */ InsufficientSpaceException(String str, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "Not enough free space" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsufficientSpaceException(String str, int i8, int i9) {
        this("Not enough free space to write " + str + " of " + i8 + " bytes, available " + i9 + " bytes.");
        r.e(str, "name");
    }
}
