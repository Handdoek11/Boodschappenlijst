package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.ne0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3510ne0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25018a = 67108864;

    /* renamed from: b, reason: collision with root package name */
    public static final ClipData f25019b = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i8, Intent intent, int i9) {
        return PendingIntent.getActivity(context, 0, c(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent b(Context context, int i8, Intent intent, int i9, int i10) {
        return PendingIntent.getService(context, 0, c(intent, i9, 0), i9);
    }

    private static Intent c(Intent intent, int i8, int i9) {
        AbstractC1762Sf0.f((i8 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        AbstractC1762Sf0.f((i8 & 1) == 0 || d(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        AbstractC1762Sf0.f((i8 & 2) == 0 || d(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        AbstractC1762Sf0.f((i8 & 4) == 0 || d(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        AbstractC1762Sf0.f((i8 & 128) == 0 || d(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        AbstractC1762Sf0.f(intent.getComponent() != null, "Must set component on Intent.");
        if (d(0, 1)) {
            AbstractC1762Sf0.f(!d(i8, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            AbstractC1762Sf0.f(d(i8, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!d(i8, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!d(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!d(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!d(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!d(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f25019b);
            }
        }
        return intent2;
    }

    private static boolean d(int i8, int i9) {
        return (i8 & i9) == i9;
    }
}
