package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ws, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1918Ws {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4169th0 f19851a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19852b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f19853c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private boolean f19854d;

    public C1918Ws(AbstractC4169th0 abstractC4169th0) {
        this.f19851a = abstractC4169th0;
        C4737yt c4737yt = C4737yt.f28216e;
        this.f19854d = false;
    }

    private final int i() {
        return this.f19853c.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z7;
        do {
            int i8 = 0;
            z7 = false;
            while (i8 <= i()) {
                if (!this.f19853c[i8].hasRemaining()) {
                    InterfaceC1143Au interfaceC1143Au = (InterfaceC1143Au) this.f19852b.get(i8);
                    if (!interfaceC1143Au.e()) {
                        ByteBuffer byteBuffer2 = i8 > 0 ? this.f19853c[i8 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC1143Au.f13686a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC1143Au.b(byteBuffer2);
                        this.f19853c[i8] = interfaceC1143Au.zzb();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z8 = true;
                        if (remaining2 <= 0 && !this.f19853c[i8].hasRemaining()) {
                            z8 = false;
                        }
                        z7 |= z8;
                    } else if (!this.f19853c[i8].hasRemaining() && i8 < i()) {
                        ((InterfaceC1143Au) this.f19852b.get(i8 + 1)).d();
                    }
                }
                i8++;
            }
        } while (z7);
    }

    public final C4737yt a(C4737yt c4737yt) {
        if (c4737yt.equals(C4737yt.f28216e)) {
            throw new zzcg("Unhandled input format:", c4737yt);
        }
        for (int i8 = 0; i8 < this.f19851a.size(); i8++) {
            InterfaceC1143Au interfaceC1143Au = (InterfaceC1143Au) this.f19851a.get(i8);
            C4737yt f8 = interfaceC1143Au.f(c4737yt);
            if (interfaceC1143Au.g()) {
                AbstractC3796qC.f(!f8.equals(C4737yt.f28216e));
                c4737yt = f8;
            }
        }
        return c4737yt;
    }

    public final ByteBuffer b() {
        if (!h()) {
            return InterfaceC1143Au.f13686a;
        }
        ByteBuffer byteBuffer = this.f19853c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(InterfaceC1143Au.f13686a);
        return this.f19853c[i()];
    }

    public final void c() {
        this.f19852b.clear();
        this.f19854d = false;
        for (int i8 = 0; i8 < this.f19851a.size(); i8++) {
            InterfaceC1143Au interfaceC1143Au = (InterfaceC1143Au) this.f19851a.get(i8);
            interfaceC1143Au.a();
            if (interfaceC1143Au.g()) {
                this.f19852b.add(interfaceC1143Au);
            }
        }
        this.f19853c = new ByteBuffer[this.f19852b.size()];
        for (int i9 = 0; i9 <= i(); i9++) {
            this.f19853c[i9] = ((InterfaceC1143Au) this.f19852b.get(i9)).zzb();
        }
    }

    public final void d() {
        if (!h() || this.f19854d) {
            return;
        }
        this.f19854d = true;
        ((InterfaceC1143Au) this.f19852b.get(0)).d();
    }

    public final void e(ByteBuffer byteBuffer) {
        if (!h() || this.f19854d) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1918Ws)) {
            return false;
        }
        C1918Ws c1918Ws = (C1918Ws) obj;
        if (this.f19851a.size() != c1918Ws.f19851a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f19851a.size(); i8++) {
            if (this.f19851a.get(i8) != c1918Ws.f19851a.get(i8)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i8 = 0; i8 < this.f19851a.size(); i8++) {
            InterfaceC1143Au interfaceC1143Au = (InterfaceC1143Au) this.f19851a.get(i8);
            interfaceC1143Au.a();
            interfaceC1143Au.c();
        }
        this.f19853c = new ByteBuffer[0];
        C4737yt c4737yt = C4737yt.f28216e;
        this.f19854d = false;
    }

    public final boolean g() {
        return this.f19854d && ((InterfaceC1143Au) this.f19852b.get(i())).e() && !this.f19853c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.f19852b.isEmpty();
    }

    public final int hashCode() {
        return this.f19851a.hashCode();
    }
}
