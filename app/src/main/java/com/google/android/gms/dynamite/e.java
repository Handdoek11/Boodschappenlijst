package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class e implements DynamiteModule.a {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0229a interfaceC0229a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int b8 = interfaceC0229a.b(context, str);
        bVar.f13460a = b8;
        if (b8 != 0) {
            bVar.f13462c = -1;
        } else {
            int a8 = interfaceC0229a.a(context, str, true);
            bVar.f13461b = a8;
            if (a8 != 0) {
                bVar.f13462c = 1;
            }
        }
        return bVar;
    }
}
