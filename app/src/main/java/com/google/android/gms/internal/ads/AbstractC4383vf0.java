package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.vf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4383vf0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C4165tf0 f27319a = new C4165tf0("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        f27319a.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String a8 = AbstractC4274uf0.a(signature.toByteArray());
                            arrayList.add(a8);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a8)) {
                                String str = Build.TAGS;
                                if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a8)) {
                                }
                            }
                            return true;
                        }
                        C4165tf0 c4165tf0 = f27319a;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ", ");
                            }
                        }
                        c4165tf0.d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f27319a.d("Play Store package is not found.", new Object[0]);
                }
            } else {
                f27319a.d("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f27319a.d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
