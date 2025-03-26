package io.ktor.client.plugins;

import F5.c;
import J6.r;

/* loaded from: classes2.dex */
public class ResponseException extends IllegalStateException {

    /* renamed from: o, reason: collision with root package name */
    private final transient c f36750o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(c cVar, String str) {
        super("Bad response: " + cVar + ". Text: \"" + str + '\"');
        r.e(cVar, "response");
        r.e(str, "cachedResponseText");
        this.f36750o = cVar;
    }
}
