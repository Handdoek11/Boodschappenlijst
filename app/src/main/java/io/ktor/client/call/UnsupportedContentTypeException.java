package io.ktor.client.call;

import J5.b;
import J6.H;
import J6.r;

/* loaded from: classes2.dex */
public final class UnsupportedContentTypeException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedContentTypeException(b bVar) {
        super("Failed to write body: " + H.b(bVar.getClass()));
        r.e(bVar, "content");
    }
}
