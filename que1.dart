import 'dart:io';

void main() {
  print("Enter your name:");
  String? name = stdin.readLineSync();

  print("Enter your age:");
  int? age = int.parse(stdin.readLineSync()!);

  int left = 100 - age;
  print('Dear $name you have $left years left to be of 100Years');
}
