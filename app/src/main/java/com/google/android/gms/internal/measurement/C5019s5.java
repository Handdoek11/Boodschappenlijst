package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5019s5 extends C5027t5 {

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ AbstractC4972m5 f29564s;

    @Override // com.google.android.gms.internal.measurement.C5027t5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4988o5(this.f29564s);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C5019s5(AbstractC4972m5 abstractC4972m5) {
        super(abstractC4972m5);
        this.f29564s = abstractC4972m5;
    }
}
