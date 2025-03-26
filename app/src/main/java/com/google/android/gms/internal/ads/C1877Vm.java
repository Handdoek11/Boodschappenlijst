package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877Vm extends C2548en {

    /* renamed from: c, reason: collision with root package name */
    private final Map f19652c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f19653d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19654e;

    /* renamed from: f, reason: collision with root package name */
    private final long f19655f;

    /* renamed from: g, reason: collision with root package name */
    private final long f19656g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19657h;

    /* renamed from: i, reason: collision with root package name */
    private final String f19658i;

    public C1877Vm(InterfaceC4410vt interfaceC4410vt, Map map) {
        super(interfaceC4410vt, "createCalendarEvent");
        this.f19652c = map;
        this.f19653d = interfaceC4410vt.f();
        this.f19654e = l("description");
        this.f19657h = l("summary");
        this.f19655f = k("start_ticks");
        this.f19656g = k("end_ticks");
        this.f19658i = l("location");
    }

    private final long k(String str) {
        String str2 = (String) this.f19652c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f19652c.get(str)) ? "" : (String) this.f19652c.get(str);
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f19654e);
        data.putExtra("eventLocation", this.f19658i);
        data.putExtra("description", this.f19657h);
        long j8 = this.f19655f;
        if (j8 > -1) {
            data.putExtra("beginTime", j8);
        }
        long j9 = this.f19656g;
        if (j9 > -1) {
            data.putExtra("endTime", j9);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        if (this.f19653d == null) {
            c("Activity context is not available.");
            return;
        }
        C2.v.t();
        if (!new C1759Se(this.f19653d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        C2.v.t();
        AlertDialog.Builder l8 = G2.D0.l(this.f19653d);
        Resources f8 = C2.v.s().f();
        l8.setTitle(f8 != null ? f8.getString(A2.d.f166r) : "Create calendar event");
        l8.setMessage(f8 != null ? f8.getString(A2.d.f167s) : "Allow Ad to create a calendar event?");
        l8.setPositiveButton(f8 != null ? f8.getString(A2.d.f164p) : "Accept", new DialogInterfaceOnClickListenerC1807Tm(this));
        l8.setNegativeButton(f8 != null ? f8.getString(A2.d.f165q) : "Decline", new DialogInterfaceOnClickListenerC1842Um(this));
        l8.create().show();
    }
}
