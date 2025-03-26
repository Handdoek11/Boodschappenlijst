package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public final class Wo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Qo0 f19844a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19845b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f19846c;

    /* synthetic */ Wo0(Qo0 qo0, List list, Integer num, Vo0 vo0) {
        this.f19844a = qo0;
        this.f19845b = list;
        this.f19846c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Wo0)) {
            return false;
        }
        Wo0 wo0 = (Wo0) obj;
        return this.f19844a.equals(wo0.f19844a) && this.f19845b.equals(wo0.f19845b) && Objects.equals(this.f19846c, wo0.f19846c);
    }

    public final int hashCode() {
        return Objects.hash(this.f19844a, this.f19845b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f19844a, this.f19845b, this.f19846c);
    }
}
