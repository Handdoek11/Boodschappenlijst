package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class VX implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f19609a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f19610b;

    /* renamed from: c, reason: collision with root package name */
    private final L60 f19611c;

    /* renamed from: d, reason: collision with root package name */
    private final View f19612d;

    public VX(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context, L60 l60, ViewGroup viewGroup) {
        this.f19609a = interfaceExecutorServiceC3522nk0;
        this.f19610b = context;
        this.f19611c = l60;
        this.f19612d = viewGroup;
    }

    final /* synthetic */ XX a() {
        ArrayList arrayList = new ArrayList();
        View view = this.f19612d;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new XX(this.f19610b, this.f19611c.f16767e, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        AbstractC3184kf.a(this.f19610b);
        return this.f19609a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.UX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19402o.a();
            }
        });
    }
}
