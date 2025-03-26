package io.ktor.http;

import J6.r;

/* loaded from: classes2.dex */
public final class UnsafeHeaderException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsafeHeaderException(String str) {
        super("Header(s) " + str + " are controlled by the engine and cannot be set explicitly");
        r.e(str, "header");
    }
}
