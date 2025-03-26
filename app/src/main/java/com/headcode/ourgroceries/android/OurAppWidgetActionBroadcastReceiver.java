package com.headcode.ourgroceries.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.headcode.ourgroceries.android.AbstractC5625q;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class OurAppWidgetActionBroadcastReceiver extends BroadcastReceiver {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34281a;

        static {
            int[] iArr = new int[AbstractC5625q.b.values().length];
            f34281a = iArr;
            try {
                iArr[AbstractC5625q.b.VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34281a[AbstractC5625q.b.ADD_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34281a[AbstractC5625q.b.SCAN_BARCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34281a[AbstractC5625q.b.ADD_BY_VOICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.headcode.ourgroceries.ListID");
        if (stringExtra == null) {
            AbstractC6635a.b("OG-WidgetABR", "No list ID specified in intent");
            return;
        }
        OurApplication ourApplication = OurApplication.f34286H;
        if (ourApplication == null) {
            AbstractC6635a.b("OG-WidgetABR", "Application is not initialized");
            return;
        }
        C5688z0 x7 = ourApplication.i().x(stringExtra);
        if (x7 == null) {
            AbstractC6635a.f("OG-WidgetABR", "List " + stringExtra + " not found");
            return;
        }
        int i8 = a.f34281a[AbstractC5625q.b.c(intent).ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                return;
            }
            AbstractC5673x.a("widgetRowAddItem");
            Intent b8 = AbstractC5625q.b(context, stringExtra, x7.U(), AbstractC5625q.b.ADD_ITEM);
            b8.putExtra("com.headcode.ourgroceries.FromWidget", true);
            context.startActivities(new Intent[]{AbstractC5625q.d(context), b8});
            return;
        }
        String stringExtra2 = intent.getStringExtra("com.headcode.ourgroceries.ItemID");
        if (stringExtra2 == null) {
            AbstractC5673x.a("widgetRowUnknown");
            AbstractC6635a.b("OG-WidgetABR", "Unknown intent");
            return;
        }
        Z0 J7 = x7.J(stringExtra2);
        if (J7 == null) {
            AbstractC6635a.f("OG-WidgetABR", "Item " + stringExtra2 + " not found");
            return;
        }
        AbstractC5673x.a("widgetRowCrossOff");
        Z0 u7 = ourApplication.i().u(x7, J7, !J7.P());
        if (u7.P()) {
            m5.D.k(ourApplication.o(), x7, u7.E());
        } else {
            m5.D.j(ourApplication.o(), x7, u7.E());
        }
    }
}
