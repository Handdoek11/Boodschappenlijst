package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.wb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4484wb0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f27510b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List f27511a = new ArrayList();

    public final List a() {
        return this.f27511a;
    }

    public final void b(View view, EnumC2525eb0 enumC2525eb0, String str) {
        C4375vb0 c4375vb0;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f27510b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.f27511a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c4375vb0 = null;
                break;
            } else {
                c4375vb0 = (C4375vb0) it.next();
                if (c4375vb0.b().get() == view) {
                    break;
                }
            }
        }
        if (c4375vb0 == null) {
            this.f27511a.add(new C4375vb0(view, enumC2525eb0, "Ad overlay"));
        }
    }

    public final void c() {
        this.f27511a.clear();
    }
}
