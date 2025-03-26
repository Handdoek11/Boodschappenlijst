package com.google.android.gms.ads.nativead;

import H2.p;
import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.InterfaceC3842qh;
import i3.BinderC5853b;
import w2.n;

/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private boolean f13118o;

    /* renamed from: s, reason: collision with root package name */
    private ImageView.ScaleType f13119s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13120t;

    /* renamed from: u, reason: collision with root package name */
    private f f13121u;

    /* renamed from: v, reason: collision with root package name */
    private g f13122v;

    public b(Context context) {
        super(context);
    }

    protected final synchronized void a(f fVar) {
        this.f13121u = fVar;
        if (this.f13118o) {
            fVar.f13143a.b(null);
        }
    }

    protected final synchronized void b(g gVar) {
        this.f13122v = gVar;
        if (this.f13120t) {
            gVar.f13144a.c(this.f13119s);
        }
    }

    public n getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f13120t = true;
        this.f13119s = scaleType;
        g gVar = this.f13122v;
        if (gVar != null) {
            gVar.f13144a.c(scaleType);
        }
    }

    public void setMediaContent(n nVar) {
        boolean X7;
        this.f13118o = true;
        f fVar = this.f13121u;
        if (fVar != null) {
            fVar.f13143a.b(nVar);
        }
        if (nVar == null) {
            return;
        }
        try {
            InterfaceC3842qh zza = nVar.zza();
            if (zza != null) {
                if (!nVar.a()) {
                    if (nVar.zzb()) {
                        X7 = zza.X(BinderC5853b.p2(this));
                    }
                    removeAllViews();
                }
                X7 = zza.g0(BinderC5853b.p2(this));
                if (X7) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e8) {
            removeAllViews();
            p.e("", e8);
        }
    }
}
