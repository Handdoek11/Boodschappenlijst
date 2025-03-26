package com.bumptech.glide;

import b2.C0955a;
import b2.InterfaceC0957c;
import d2.AbstractC5710l;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC0957c f12600o = C0955a.b();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            return (l) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    final InterfaceC0957c c() {
        return this.f12600o;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return AbstractC5710l.d(this.f12600o, ((l) obj).f12600o);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC0957c interfaceC0957c = this.f12600o;
        if (interfaceC0957c != null) {
            return interfaceC0957c.hashCode();
        }
        return 0;
    }
}
