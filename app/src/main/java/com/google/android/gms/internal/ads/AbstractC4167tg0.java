package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4167tg0 extends AbstractC1520Lg0 implements InterfaceC1272Eh0 {
    protected AbstractC4167tg0(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1520Lg0
    final Collection i(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1520Lg0
    final Collection j(Object obj, Collection collection) {
        return l(obj, (List) collection, null);
    }
}
