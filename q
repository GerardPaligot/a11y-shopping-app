[33mcommit 60fb6e127c7d1578184ba7561072abe3eb3527a3[m[33m ([m[1;36mHEAD -> [m[1;32mmain-a11y[m[33m)[m
Author: Gerard Paligot <gerard.paligot@gmail.com>
Date:   Mon Mar 21 15:32:42 2022 +0100

    feat: Add strings.xml in EN and FR for a11y translations.

[1mdiff --git a/app/src/main/java/app/shopping/a11y/ui/components/ProductItem.kt b/app/src/main/java/app/shopping/a11y/ui/components/ProductItem.kt[m
[1mindex d029b1d..0d50cfa 100644[m
[1m--- a/app/src/main/java/app/shopping/a11y/ui/components/ProductItem.kt[m
[1m+++ b/app/src/main/java/app/shopping/a11y/ui/components/ProductItem.kt[m
[36m@@ -16,6 +16,7 @@[m [mimport androidx.compose.runtime.setValue[m
 import androidx.compose.ui.Alignment[m
 import androidx.compose.ui.Modifier[m
 import androidx.compose.ui.res.painterResource[m
[32m+[m[32mimport androidx.compose.ui.res.stringResource[m
 import androidx.compose.ui.semantics.semantics[m
 import androidx.compose.ui.tooling.preview.Preview[m
 import androidx.compose.ui.unit.dp[m
[1mdiff --git a/app/src/main/java/app/shopping/a11y/ui/screens/list/ProductList.kt b/app/src/main/java/app/shopping/a11y/ui/screens/list/ProductList.kt[m
[1mindex ee26b77..cb31ba6 100644[m
[1m--- a/app/src/main/java/app/shopping/a11y/ui/screens/list/ProductList.kt[m
[1m+++ b/app/src/main/java/app/shopping/a11y/ui/screens/list/ProductList.kt[m
[36m@@ -83,7 +83,10 @@[m [mfun ProductList([m
                         }[m
                     }[m
                     IconButton(onClick = onSettingsClicked) {[m
[31m-                        Icon(imageVector = Icons.Default.Settings, contentDescription = null)[m
[32m+[m[32m                        Icon([m
[32m+[m[32m                            imageVector = Icons.Default.Settings,[m
[32m+[m[32m                            contentDescription = stringResource(id = R.string.a11y_open_settings)[m
[32m+[m[32m                        )[m
                     }[m
                 },[m
                 navigationIcon = {[m
