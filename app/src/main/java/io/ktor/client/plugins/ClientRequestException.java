package io.ktor.client.plugins;

import F5.c;
import J6.r;

/* loaded from: classes2.dex */
public final class ClientRequestException extends ResponseException {

    /* renamed from: s, reason: collision with root package name */
    private final String f36748s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRequestException(c cVar, String str) {
        super(cVar, str);
        r.e(cVar, "response");
        r.e(str, "cachedResponseText");
        this.f36748s = "Client request(" + cVar.M().d().E().d() + ' ' + cVar.M().d().k() + ") invalid: " + cVar.e() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f36748s;
    }
}
