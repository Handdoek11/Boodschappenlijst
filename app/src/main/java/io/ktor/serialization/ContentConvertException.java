package io.ktor.serialization;

import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes2.dex */
public class ContentConvertException extends Exception {
    public /* synthetic */ ContentConvertException(String str, Throwable th, int i8, AbstractC0650j abstractC0650j) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentConvertException(String str, Throwable th) {
        super(str, th);
        r.e(str, "message");
    }
}
