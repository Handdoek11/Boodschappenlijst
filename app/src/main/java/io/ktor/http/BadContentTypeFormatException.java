package io.ktor.http;

import J6.r;

/* loaded from: classes2.dex */
public final class BadContentTypeFormatException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadContentTypeFormatException(String str) {
        super("Bad Content-Type format: " + str);
        r.e(str, "value");
    }
}
