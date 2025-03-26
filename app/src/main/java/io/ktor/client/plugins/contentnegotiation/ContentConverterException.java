package io.ktor.client.plugins.contentnegotiation;

import J6.r;

/* loaded from: classes2.dex */
public final class ContentConverterException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentConverterException(String str) {
        super(str);
        r.e(str, "message");
    }
}
