package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class f implements DynamiteModule.a {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0229a interfaceC0229a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int a8 = interfaceC0229a.a(context, str, false);
        bVar.f13461b = a8;
        bVar.f13462c = a8 != 0 ? 1 : 0;
        return bVar;
    }
}
