package io.ktor.client.plugins;

import F5.c;
import J6.r;

/* loaded from: classes2.dex */
public final class RedirectResponseException extends ResponseException {

    /* renamed from: s, reason: collision with root package name */
    private final String f36749s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedirectResponseException(c cVar, String str) {
        super(cVar, str);
        r.e(cVar, "response");
        r.e(str, "cachedResponseText");
        this.f36749s = "Unhandled redirect: " + cVar.M().d().E().d() + ' ' + cVar.M().d().k() + ". Status: " + cVar.e() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f36749s;
    }
}
