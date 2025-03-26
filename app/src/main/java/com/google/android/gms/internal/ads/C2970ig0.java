package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.ig0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2970ig0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2862hg0 f23043a;

    private C2970ig0(InterfaceC2862hg0 interfaceC2862hg0) {
        AbstractC1232Df0 abstractC1232Df0 = C1196Cf0.f14210s;
        this.f23043a = interfaceC2862hg0;
    }

    public static C2970ig0 a(int i8) {
        return new C2970ig0(new C2427dg0(4000));
    }

    public static C2970ig0 b(AbstractC1232Df0 abstractC1232Df0) {
        return new C2970ig0(new C2007Zf0(abstractC1232Df0));
    }

    public static C2970ig0 c(Pattern pattern) {
        C1448Jf0 c1448Jf0 = new C1448Jf0(pattern);
        AbstractC1762Sf0.i(!((C1412If0) c1448Jf0.a("")).f15978a.matches(), "The pattern may not match the empty string: %s", c1448Jf0);
        return new C2970ig0(new C2210bg0(c1448Jf0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator g(CharSequence charSequence) {
        return this.f23043a.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new C2535eg0(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator g8 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g8.hasNext()) {
            arrayList.add((String) g8.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
