package io.ktor.utils.io.internal;

import J6.r;
import Y5.a;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private io.ktor.utils.io.a f36915a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f36916b;

    /* renamed from: c, reason: collision with root package name */
    private Y5.a f36917c;

    /* renamed from: d, reason: collision with root package name */
    private h f36918d;

    public j(io.ktor.utils.io.a aVar) {
        r.e(aVar, "channel");
        this.f36915a = aVar.p0();
        a.e eVar = Y5.a.f6125j;
        this.f36916b = eVar.a().h();
        this.f36917c = eVar.a();
        this.f36918d = this.f36915a.O().f36896b;
    }
}
