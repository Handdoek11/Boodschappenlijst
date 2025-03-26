package io.ktor.utils.io.core.internal;

import J6.r;

/* loaded from: classes2.dex */
public final class MalformedUTF8InputException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MalformedUTF8InputException(String str) {
        super(str);
        r.e(str, "message");
    }
}
