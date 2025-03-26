package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C4889d1;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4880c1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29233v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f29234w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ Context f29235x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ Bundle f29236y;

    /* renamed from: z, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29237z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4880c1(C4889d1 c4889d1, String str, String str2, Context context, Bundle bundle) {
        super(c4889d1);
        this.f29233v = str;
        this.f29234w = str2;
        this.f29235x = context;
        this.f29236y = bundle;
        this.f29237z = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f29237z.G(this.f29233v, this.f29234w)) {
                str3 = this.f29234w;
                str2 = this.f29233v;
                str = this.f29237z.f29254a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Z2.r.l(this.f29235x);
            C4889d1 c4889d1 = this.f29237z;
            c4889d1.f29262i = c4889d1.d(this.f29235x, true);
            if (this.f29237z.f29262i == null) {
                Log.w(this.f29237z.f29254a, "Failed to connect to measurement client.");
                return;
            }
            int a8 = DynamiteModule.a(this.f29235x, ModuleDescriptor.MODULE_ID);
            ((O0) Z2.r.l(this.f29237z.f29262i)).initialize(BinderC5853b.p2(this.f29235x), new C4871b1(106000L, Math.max(a8, r0), DynamiteModule.c(this.f29235x, ModuleDescriptor.MODULE_ID) < a8, str, str2, str3, this.f29236y, w3.n.a(this.f29235x)), this.f29263o);
        } catch (Exception e8) {
            this.f29237z.q(e8, true, false);
        }
    }
}
